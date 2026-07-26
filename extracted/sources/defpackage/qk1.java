package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class qk1 extends cw1 {
    public static final pk1 y = new pk1(0);
    public final ow1 n;
    public final m38 o;
    public final l38 p;
    public final mw1 q;
    public float r;
    public boolean s;
    public final ValueAnimator t;
    public ValueAnimator u;
    public TimeInterpolator v;
    public TimeInterpolator w;
    public TimeInterpolator x;

    public qk1(Context context, t80 t80Var, ow1 ow1Var) {
        super(context, t80Var);
        this.s = false;
        this.n = ow1Var;
        mw1 mw1Var = new mw1();
        this.q = mw1Var;
        mw1Var.h = true;
        m38 m38Var = new m38();
        this.o = m38Var;
        m38Var.a(1.0f);
        m38Var.b(50.0f);
        l38 l38Var = new l38(this, y);
        this.p = l38Var;
        l38Var.m = m38Var;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.t = valueAnimator;
        valueAnimator.setDuration(1000L);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(new pj(this, t80Var, 3));
        if (t80Var.b(true) && t80Var.m != 0) {
            valueAnimator.start();
        }
        if (this.i != 1.0f) {
            this.i = 1.0f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.l)) {
            canvas.save();
            Rect bounds = getBounds();
            float fB = b();
            ObjectAnimator objectAnimator = this.d;
            boolean z = objectAnimator != null && objectAnimator.isRunning();
            ObjectAnimator objectAnimator2 = this.e;
            boolean z2 = objectAnimator2 != null && objectAnimator2.isRunning();
            ow1 ow1Var = this.n;
            ow1Var.a.d();
            ow1Var.a(canvas, bounds, fB, z, z2);
            float fC = c();
            mw1 mw1Var = this.q;
            mw1Var.f = fC;
            Paint.Style style = Paint.Style.FILL;
            Paint paint = this.j;
            paint.setStyle(style);
            paint.setAntiAlias(true);
            t80 t80Var = this.b;
            mw1Var.c = t80Var.e[0];
            int iR = t80Var.i;
            if (iR > 0) {
                if (!(this.n instanceof e74)) {
                    iR = (int) ((at2.R(mw1Var.b, 0.0f, 0.01f) * iR) / 0.01f);
                }
                this.n.d(canvas, paint, mw1Var.b, 1.0f, t80Var.f, this.k, iR);
            } else {
                this.n.d(canvas, paint, 0.0f, 1.0f, t80Var.f, this.k, 0);
            }
            this.n.c(canvas, paint, mw1Var, this.k);
            this.n.b(t80Var.e[0], this.k, canvas, paint);
            canvas.restore();
        }
    }

    @Override // defpackage.cw1
    public final boolean e(boolean z, boolean z2, boolean z3) {
        boolean zE = super.e(z, z2, z3);
        fl flVar = this.c;
        ContentResolver contentResolver = this.a.getContentResolver();
        flVar.getClass();
        float fA = fl.a(contentResolver);
        if (fA == 0.0f) {
            this.s = true;
            return zE;
        }
        this.s = false;
        this.o.b(50.0f / fA);
        return zE;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.n.e();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.n.f();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.p.d();
        this.q.b = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        float f = i;
        float f2 = (f < 1000.0f || f > 9000.0f) ? 0.0f : 1.0f;
        boolean z = this.s;
        mw1 mw1Var = this.q;
        l38 l38Var = this.p;
        if (z) {
            l38Var.d();
            mw1Var.b = f / 10000.0f;
            invalidateSelf();
            mw1Var.e = f2;
            invalidateSelf();
        } else {
            l38Var.b = mw1Var.b * 10000.0f;
            l38Var.c = true;
            l38Var.a(f);
        }
        return true;
    }
}
