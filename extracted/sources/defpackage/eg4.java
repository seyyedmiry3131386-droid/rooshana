package defpackage;

import android.animation.Animator;
import android.graphics.PointF;
import android.view.Choreographer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class eg4 extends w70 implements Choreographer.FrameCallback {
    public float d;
    public boolean e;
    public long f;
    public float g;
    public float h;
    public int i;
    public float j;
    public float k;
    public gf4 l;
    public boolean m;
    public boolean n;

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        a(g());
        h(true);
    }

    public final float d() {
        gf4 gf4Var = this.l;
        if (gf4Var == null) {
            return 0.0f;
        }
        float f = this.h;
        float f2 = gf4Var.l;
        return (f - f2) / (gf4Var.m - f2);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.m) {
            h(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        gf4 gf4Var = this.l;
        if (gf4Var == null || !this.m) {
            return;
        }
        float fAbs = (this.f != 0 ? j - r2 : 0L) / ((1.0E9f / gf4Var.n) / Math.abs(this.d));
        float f = this.g;
        if (g()) {
            fAbs = -fAbs;
        }
        float f2 = f + fAbs;
        float f3 = f();
        float fE = e();
        PointF pointF = aw4.a;
        boolean z = f2 >= f3 && f2 <= fE;
        float f4 = this.g;
        float fB = aw4.b(f2, f(), e());
        this.g = fB;
        if (this.n) {
            fB = (float) Math.floor(fB);
        }
        this.h = fB;
        this.f = j;
        if (z) {
            if (!this.n || this.g != f4) {
                c();
            }
        } else if (getRepeatCount() == -1 || this.i < getRepeatCount()) {
            if (getRepeatMode() == 2) {
                this.e = !this.e;
                this.d = -this.d;
            } else {
                float fE2 = g() ? e() : f();
                this.g = fE2;
                this.h = fE2;
            }
            this.f = j;
            if (!this.n || this.g != f4) {
                c();
            }
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
            }
            this.i++;
        } else {
            float f5 = this.d < 0.0f ? f() : e();
            this.g = f5;
            this.h = f5;
            h(true);
            if (!this.n || this.g != f4) {
                c();
            }
            a(g());
        }
        if (this.l == null) {
            return;
        }
        float f6 = this.h;
        if (f6 < this.j || f6 > this.k) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.j), Float.valueOf(this.k), Float.valueOf(this.h)));
        }
    }

    public final float e() {
        gf4 gf4Var = this.l;
        if (gf4Var == null) {
            return 0.0f;
        }
        float f = this.k;
        return f == 2.1474836E9f ? gf4Var.m : f;
    }

    public final float f() {
        gf4 gf4Var = this.l;
        if (gf4Var == null) {
            return 0.0f;
        }
        float f = this.j;
        return f == -2.1474836E9f ? gf4Var.l : f;
    }

    public final boolean g() {
        return this.d < 0.0f;
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float f;
        float fE;
        float f2;
        if (this.l == null) {
            return 0.0f;
        }
        if (g()) {
            f = e() - this.h;
            fE = e();
            f2 = f();
        } else {
            f = this.h - f();
            fE = e();
            f2 = f();
        }
        return f / (fE - f2);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(d());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        gf4 gf4Var = this.l;
        if (gf4Var == null) {
            return 0L;
        }
        return (long) gf4Var.b();
    }

    public final void h(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.m = false;
        }
    }

    public final void i(float f) {
        if (this.g == f) {
            return;
        }
        float fB = aw4.b(f, f(), e());
        this.g = fB;
        if (this.n) {
            fB = (float) Math.floor(fB);
        }
        this.h = fB;
        this.f = 0L;
        c();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.m;
    }

    public final void j(float f, float f2) {
        if (f > f2) {
            throw new IllegalArgumentException("minFrame (" + f + ") must be <= maxFrame (" + f2 + ")");
        }
        gf4 gf4Var = this.l;
        float f3 = gf4Var == null ? -3.4028235E38f : gf4Var.l;
        float f4 = gf4Var == null ? Float.MAX_VALUE : gf4Var.m;
        float fB = aw4.b(f, f3, f4);
        float fB2 = aw4.b(f2, f3, f4);
        if (fB == this.j && fB2 == this.k) {
            return;
        }
        this.j = fB;
        this.k = fB2;
        i((int) aw4.b(this.h, fB, fB2));
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.e) {
            return;
        }
        this.e = false;
        this.d = -this.d;
    }
}
