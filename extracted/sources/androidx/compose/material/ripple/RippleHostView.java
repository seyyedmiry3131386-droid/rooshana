package androidx.compose.material.ripple;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import defpackage.ey7;
import defpackage.fy8;
import defpackage.gu9;
import defpackage.js3;
import defpackage.ok4;
import defpackage.rj6;
import defpackage.u03;
import defpackage.x2;
import defpackage.zu0;

/* JADX INFO: loaded from: classes.dex */
public final class RippleHostView extends View {
    public static final int[] f = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] g = new int[0];
    public fy8 a;
    public Boolean b;
    public Long c;
    public u03 d;
    public x2 e;

    public RippleHostView(Context context) {
        super(context);
    }

    private final void setRippleState(boolean z) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.c;
        long jLongValue = jCurrentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z || jLongValue >= 5) {
            int[] iArr = z ? f : g;
            fy8 fy8Var = this.a;
            if (fy8Var != null) {
                fy8Var.setState(iArr);
            }
        } else {
            u03 u03Var = new u03(22, this);
            this.d = u03Var;
            postDelayed(u03Var, 50L);
        }
        this.c = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$1(RippleHostView rippleHostView) {
        fy8 fy8Var = rippleHostView.a;
        if (fy8Var != null) {
            fy8Var.setState(g);
        }
        rippleHostView.d = null;
    }

    public final void b(rj6 rj6Var, boolean z, long j, int i, long j2, x2 x2Var) {
        if (this.a == null || !Boolean.valueOf(z).equals(this.b)) {
            fy8 fy8Var = new fy8(z);
            setBackground(fy8Var);
            this.a = fy8Var;
            this.b = Boolean.valueOf(z);
        }
        fy8 fy8Var2 = this.a;
        js3.m(fy8Var2);
        this.e = x2Var;
        m0setRipplePropertiesbiQXAtU(j, i, j2, 0.1f);
        if (z) {
            fy8Var2.setHotspot(Float.intBitsToFloat((int) (rj6Var.a >> 32)), Float.intBitsToFloat((int) (rj6Var.a & 4294967295L)));
        } else {
            fy8Var2.setHotspot(fy8Var2.getBounds().centerX(), fy8Var2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.e = null;
        u03 u03Var = this.d;
        if (u03Var != null) {
            removeCallbacks(u03Var);
            u03 u03Var2 = this.d;
            js3.m(u03Var2);
            u03Var2.run();
        } else {
            fy8 fy8Var = this.a;
            if (fy8Var != null) {
                fy8Var.setState(g);
            }
        }
        fy8 fy8Var2 = this.a;
        if (fy8Var2 == null) {
            return;
        }
        fy8Var2.setVisible(false, false);
        unscheduleDrawable(fy8Var2);
    }

    public final void d() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            c();
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        x2 x2Var = this.e;
        if (x2Var != null) {
            x2Var.invoke();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    /* JADX INFO: renamed from: setRippleProperties-biQXAtU, reason: not valid java name */
    public final void m0setRipplePropertiesbiQXAtU(long j, int i, long j2, float f2) {
        fy8 fy8Var = this.a;
        if (fy8Var == null) {
            return;
        }
        Integer num = fy8Var.c;
        if (num == null || num.intValue() != i) {
            fy8Var.c = Integer.valueOf(i);
            fy8Var.setRadius(i);
        }
        if (Build.VERSION.SDK_INT < 28) {
            f2 *= 2;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        long jB = zu0.b(f2, j2);
        zu0 zu0Var = fy8Var.b;
        if (!(zu0Var == null ? false : zu0.c(zu0Var.a, jB))) {
            fy8Var.b = new zu0(jB);
            fy8Var.setColor(ColorStateList.valueOf(gu9.E(jB)));
        }
        Rect rect = new Rect(0, 0, ok4.V(ey7.e(j)), ok4.V(ey7.c(j)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        fy8Var.setBounds(rect);
    }
}
