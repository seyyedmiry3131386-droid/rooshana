package defpackage;

import android.graphics.Rect;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class v99 {
    public final int a;
    public final int b;
    public final ly4 c;
    public final int d;
    public final on f;
    public final Interpolator g;
    public float i;
    public float j;
    public final boolean m;
    public final wx3 e = new wx3(0);
    public boolean h = false;
    public final Rect l = new Rect();
    public long k = System.nanoTime();

    public v99(on onVar, ly4 ly4Var, int i, int i2, int i3, Interpolator interpolator, int i4, int i5) {
        this.m = false;
        this.f = onVar;
        this.c = ly4Var;
        this.d = i2;
        if (((ArrayList) onVar.e) == null) {
            onVar.e = new ArrayList();
        }
        ((ArrayList) onVar.e).add(this);
        this.g = interpolator;
        this.a = i4;
        this.b = i5;
        if (i3 == 3) {
            this.m = true;
        }
        this.j = i == 0 ? Float.MAX_VALUE : 1.0f / i;
        a();
    }

    public final void a() {
        boolean z = this.h;
        int i = this.b;
        int i2 = this.a;
        Interpolator interpolator = this.g;
        on onVar = this.f;
        ly4 ly4Var = this.c;
        if (z) {
            long jNanoTime = System.nanoTime();
            long j = jNanoTime - this.k;
            this.k = jNanoTime;
            float f = this.i - (((float) (j * 1.0E-6d)) * this.j);
            this.i = f;
            if (f < 0.0f) {
                this.i = 0.0f;
            }
            boolean zF = ly4Var.f(interpolator == null ? this.i : interpolator.getInterpolation(this.i), jNanoTime, this.e, ly4Var.b);
            if (this.i <= 0.0f) {
                if (i2 != -1) {
                    ly4Var.b.setTag(i2, Long.valueOf(System.nanoTime()));
                }
                if (i != -1) {
                    ly4Var.b.setTag(i, null);
                }
                ((ArrayList) onVar.f).add(this);
            }
            if (this.i > 0.0f || zF) {
                ((MotionLayout) onVar.a).invalidate();
                return;
            }
            return;
        }
        long jNanoTime2 = System.nanoTime();
        long j2 = jNanoTime2 - this.k;
        this.k = jNanoTime2;
        float f2 = (((float) (j2 * 1.0E-6d)) * this.j) + this.i;
        this.i = f2;
        if (f2 >= 1.0f) {
            this.i = 1.0f;
        }
        boolean zF2 = ly4Var.f(interpolator == null ? this.i : interpolator.getInterpolation(this.i), jNanoTime2, this.e, ly4Var.b);
        if (this.i >= 1.0f) {
            if (i2 != -1) {
                ly4Var.b.setTag(i2, Long.valueOf(System.nanoTime()));
            }
            if (i != -1) {
                ly4Var.b.setTag(i, null);
            }
            if (!this.m) {
                ((ArrayList) onVar.f).add(this);
            }
        }
        if (this.i < 1.0f || zF2) {
            ((MotionLayout) onVar.a).invalidate();
        }
    }

    public final void b() {
        this.h = true;
        int i = this.d;
        if (i != -1) {
            this.j = i == 0 ? Float.MAX_VALUE : 1.0f / i;
        }
        ((MotionLayout) this.f.a).invalidate();
        this.k = System.nanoTime();
    }
}
