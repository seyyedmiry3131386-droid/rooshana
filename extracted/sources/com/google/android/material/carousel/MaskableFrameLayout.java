package com.google.android.material.carousel;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import defpackage.aj4;
import defpackage.as7;
import defpackage.at2;
import defpackage.bt7;
import defpackage.ct7;
import defpackage.dt7;
import defpackage.ft7;
import defpackage.kt5;
import defpackage.vj3;
import defpackage.yk;

/* JADX INFO: loaded from: classes.dex */
public class MaskableFrameLayout extends FrameLayout implements aj4, bt7 {
    public static final /* synthetic */ int i = 0;
    public float a;
    public final RectF b;
    public final Rect c;
    public as7 d;
    public final ct7 e;
    public Boolean f;
    public View.OnHoverListener g;
    public boolean h;

    public MaskableFrameLayout(Context context) {
        this(context, null);
    }

    public final void a() {
        if (this.a != -1.0f) {
            float fB = yk.b(0.0f, getWidth() / 2.0f, 0.0f, 1.0f, this.a);
            setMaskRectF(new RectF(fB, 0.0f, getWidth() - fB, getHeight()));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ct7 ct7Var = this.e;
        Path path = ct7Var.e;
        if (!ct7Var.b() || path.isEmpty()) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        RectF rectF = this.b;
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public RectF getMaskRectF() {
        return this.b;
    }

    @Deprecated
    public float getMaskXPercentage() {
        return this.a;
    }

    public as7 getShapeAppearanceModel() {
        return this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Boolean bool = this.f;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            ct7 ct7Var = this.e;
            if (zBooleanValue != ct7Var.a) {
                ct7Var.a = zBooleanValue;
                ct7Var.a(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ct7 ct7Var = this.e;
        this.f = Boolean.valueOf(ct7Var.a);
        if (true != ct7Var.a) {
            ct7Var.a = true;
            ct7Var.a(this);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        RectF rectF = this.b;
        if (!rectF.isEmpty() && ((action == 9 || action == 10 || action == 7) && !rectF.contains(motionEvent.getX(), motionEvent.getY()))) {
            if (this.h && this.g != null) {
                motionEvent.setAction(10);
                this.g.onHover(this, motionEvent);
            }
            this.h = false;
            return false;
        }
        if (this.g != null) {
            if (!this.h && action == 7) {
                motionEvent.setAction(9);
                this.h = true;
            }
            if (action == 7 || action == 9) {
                this.h = true;
            }
            this.g.onHover(this, motionEvent);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        Rect rect = this.c;
        accessibilityNodeInfo.getBoundsInScreen(rect);
        float x = getX();
        RectF rectF = this.b;
        if (x > 0.0f) {
            rect.left = (int) (rect.left + rectF.left);
        }
        if (getY() > 0.0f) {
            rect.top = (int) (rect.top + rectF.top);
        }
        rect.right = Math.round(rectF.width()) + rect.left;
        rect.bottom = Math.round(rectF.height()) + rect.top;
        accessibilityNodeInfo.setBoundsInScreen(rect);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        RectF rectF = this.b;
        if (rectF.isEmpty() || rectF.contains(motionEvent.getX(), motionEvent.getY())) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (this.a != -1.0f) {
            a();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        RectF rectF = this.b;
        if (rectF.isEmpty() || motionEvent.getAction() != 0 || rectF.contains(motionEvent.getX(), motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setForceCompatClipping(boolean z) {
        ct7 ct7Var = this.e;
        if (z != ct7Var.a) {
            ct7Var.a = z;
            ct7Var.a(this);
        }
    }

    @Override // defpackage.aj4
    public void setMaskRectF(RectF rectF) {
        RectF rectF2 = this.b;
        rectF2.set(rectF);
        ct7 ct7Var = this.e;
        ct7Var.d = rectF2;
        ct7Var.c();
        ct7Var.a(this);
    }

    @Deprecated
    public void setMaskXPercentage(float f) {
        float fR = at2.R(f, 0.0f, 1.0f);
        if (this.a != fR) {
            this.a = fR;
            a();
        }
    }

    @Override // android.view.View
    public void setOnHoverListener(View.OnHoverListener onHoverListener) {
        this.g = onHoverListener;
    }

    @Override // defpackage.bt7
    public void setShapeAppearanceModel(as7 as7Var) {
        as7 as7VarI = as7Var.i(new vj3(10));
        this.d = as7VarI;
        ct7 ct7Var = this.e;
        ct7Var.c = as7VarI;
        ct7Var.c();
        ct7Var.a(this);
    }

    public MaskableFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaskableFrameLayout(Context context, AttributeSet attributeSet, int i2) {
        ct7 dt7Var;
        super(context, attributeSet, i2);
        this.a = -1.0f;
        this.b = new RectF();
        this.c = new Rect();
        if (Build.VERSION.SDK_INT >= 33) {
            dt7Var = new ft7(this);
        } else {
            dt7Var = new dt7(this);
        }
        this.e = dt7Var;
        this.f = null;
        this.h = false;
        setShapeAppearanceModel(as7.d(context, attributeSet, i2, 0).a());
    }

    public void setOnMaskChangedListener(kt5 kt5Var) {
    }
}
