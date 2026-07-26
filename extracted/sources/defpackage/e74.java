package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;

/* JADX INFO: loaded from: classes.dex */
public final class e74 extends ow1 {
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public boolean m;
    public float n;
    public Pair o;

    @Override // defpackage.ow1
    public final void a(Canvas canvas, Rect rect, float f, boolean z, boolean z2) {
        if (this.f != rect.width()) {
            this.f = rect.width();
            g();
        }
        float fE = e();
        canvas.translate((rect.width() / 2.0f) + rect.left, Math.max(0.0f, (rect.height() - fE) / 2.0f) + (rect.height() / 2.0f) + rect.top);
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) this.a;
        if (linearProgressIndicatorSpec.q) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f2 = this.f / 2.0f;
        float f3 = fE / 2.0f;
        canvas.clipRect(-f2, -f3, f2, f3);
        this.g = linearProgressIndicatorSpec.a * f;
        this.h = Math.min(r0 / 2, linearProgressIndicatorSpec.a()) * f;
        this.j = linearProgressIndicatorSpec.l * f;
        this.i = Math.min(linearProgressIndicatorSpec.a / 2.0f, linearProgressIndicatorSpec.e()) * f;
        if (z || z2) {
            if ((z && linearProgressIndicatorSpec.g == 2) || (z2 && linearProgressIndicatorSpec.h == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z || (z2 && linearProgressIndicatorSpec.h != 3)) {
                canvas.translate(0.0f, ((1.0f - f) * linearProgressIndicatorSpec.a) / 2.0f);
            }
        }
        if (z2 && linearProgressIndicatorSpec.h == 3) {
            this.n = f;
        } else {
            this.n = 1.0f;
        }
    }

    @Override // defpackage.ow1
    public final void b(int i, int i2, Canvas canvas, Paint paint) {
        int iJ = m91.j(i, i2);
        this.m = false;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) this.a;
        if (linearProgressIndicatorSpec.r <= 0 || iJ == 0) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iJ);
        Integer num = linearProgressIndicatorSpec.s;
        nw1 nw1Var = new nw1(new float[]{(this.f / 2.0f) - (num != null ? (linearProgressIndicatorSpec.r / 2.0f) + num.floatValue() : this.g / 2.0f), 0.0f}, new float[]{1.0f, 0.0f});
        int i3 = linearProgressIndicatorSpec.r;
        j(canvas, paint, nw1Var, i3, i3, (this.h * i3) / this.g, null, 0.0f, 0.0f, 0.0f, false);
    }

    @Override // defpackage.ow1
    public final void c(Canvas canvas, Paint paint, mw1 mw1Var, int i) {
        int iJ = m91.j(mw1Var.c, i);
        this.m = mw1Var.h;
        float f = mw1Var.a;
        float f2 = mw1Var.b;
        int i2 = mw1Var.d;
        i(canvas, paint, f, f2, iJ, i2, i2, mw1Var.e, mw1Var.f, true);
    }

    @Override // defpackage.ow1
    public final void d(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        int iJ = m91.j(i, i2);
        this.m = false;
        i(canvas, paint, f, f2, iJ, i3, i3, 0.0f, 0.0f, false);
    }

    @Override // defpackage.ow1
    public final int e() {
        t80 t80Var = this.a;
        return (((LinearProgressIndicatorSpec) t80Var).l * 2) + ((LinearProgressIndicatorSpec) t80Var).a;
    }

    @Override // defpackage.ow1
    public final int f() {
        return -1;
    }

    @Override // defpackage.ow1
    public final void g() {
        Path path = this.b;
        path.rewind();
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) this.a;
        if (linearProgressIndicatorSpec.b(this.m)) {
            int i = this.m ? linearProgressIndicatorSpec.j : linearProgressIndicatorSpec.k;
            float f = this.f;
            int i2 = (int) (f / i);
            this.k = f / i2;
            for (int i3 = 0; i3 <= i2; i3++) {
                int i4 = i3 * 2;
                float f2 = i4 + 1;
                path.cubicTo(i4 + 0.48f, 0.0f, f2 - 0.48f, 1.0f, f2, 1.0f);
                float f3 = f2 + 0.48f;
                float f4 = i4 + 2;
                path.cubicTo(f3, 1.0f, f4 - 0.48f, 0.0f, f4, 0.0f);
            }
            Matrix matrix = this.e;
            matrix.reset();
            matrix.setScale(this.k / 2.0f, -2.0f);
            matrix.postTranslate(0.0f, 1.0f);
            path.transform(matrix);
        } else {
            path.lineTo(this.f, 0.0f);
        }
        this.d.setPath(path, false);
    }

    public final void i(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3, float f3, float f4, boolean z) {
        float fP0;
        float fP02;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec;
        float f5;
        Canvas canvas2;
        Pair pair = this.o;
        float fR = at2.R(f, 0.0f, 1.0f);
        float fR2 = at2.R(f2, 0.0f, 1.0f);
        float fP03 = yq2.p0(1.0f - this.n, 1.0f, fR);
        float fP04 = yq2.p0(1.0f - this.n, 1.0f, fR2);
        int iR = (int) ((at2.R(fP03, 0.0f, 0.01f) * i2) / 0.01f);
        int iR2 = (int) (((1.0f - at2.R(fP04, 0.99f, 1.0f)) * i3) / 0.01f);
        float f6 = this.f;
        int i4 = (int) ((fP03 * f6) + iR);
        int i5 = (int) ((fP04 * f6) - iR2);
        float f7 = this.h;
        float f8 = this.i;
        if (f7 != f8) {
            float fMax = Math.max(f7, f8);
            float f9 = this.f;
            float f10 = fMax / f9;
            fP0 = yq2.p0(this.h, this.i, at2.R(i4 / f9, 0.0f, f10) / f10);
            float f11 = this.h;
            float f12 = this.i;
            float f13 = this.f;
            fP02 = yq2.p0(f11, f12, at2.R((f13 - i5) / f13, 0.0f, f10) / f10);
        } else {
            fP0 = f7;
            fP02 = fP0;
        }
        float f14 = (-this.f) / 2.0f;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec2 = (LinearProgressIndicatorSpec) this.a;
        boolean z2 = linearProgressIndicatorSpec2.b(this.m) && z && f3 > 0.0f;
        if (i4 <= i5) {
            float f15 = i4 + fP0;
            float f16 = i5 - fP02;
            float f17 = fP0 * 2.0f;
            float f18 = fP02 * 2.0f;
            paint.setColor(i);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.g);
            ((nw1) pair.first).b();
            ((nw1) pair.second).b();
            ((nw1) pair.first).e(f15 + f14);
            ((nw1) pair.second).e(f16 + f14);
            if (i4 == 0 && f16 + fP02 < f15 + fP0) {
                nw1 nw1Var = (nw1) pair.first;
                float f19 = this.g;
                j(canvas, paint, nw1Var, f17, f19, fP0, (nw1) pair.second, f18, f19, fP02, true);
                return;
            }
            if (f15 - fP0 > f16 - fP02) {
                nw1 nw1Var2 = (nw1) pair.second;
                float f20 = this.g;
                j(canvas, paint, nw1Var2, f18, f20, fP02, (nw1) pair.first, f17, f20, fP0, false);
                return;
            }
            float f21 = fP02;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(linearProgressIndicatorSpec2.c() ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            if (z2) {
                float f22 = this.f;
                float f23 = f15 / f22;
                float f24 = f16 / f22;
                linearProgressIndicatorSpec = linearProgressIndicatorSpec2;
                int i6 = this.m ? linearProgressIndicatorSpec.j : linearProgressIndicatorSpec.k;
                if (i6 != this.l) {
                    this.l = i6;
                    g();
                }
                Path path = this.c;
                path.rewind();
                float f25 = (-this.f) / 2.0f;
                boolean zB = linearProgressIndicatorSpec.b(this.m);
                if (zB) {
                    float f26 = this.f;
                    f5 = 1.0f;
                    float f27 = this.k;
                    float f28 = f26 / f27;
                    float f29 = f4 / f28;
                    float f30 = f28 / (f28 + 1.0f);
                    f23 = (f23 + f29) * f30;
                    f24 = (f24 + f29) * f30;
                    f25 -= f27 * f4;
                } else {
                    f5 = 1.0f;
                }
                PathMeasure pathMeasure = this.d;
                float length = pathMeasure.getLength() * f23;
                float length2 = pathMeasure.getLength() * f24;
                pathMeasure.getSegment(length, length2, path, true);
                nw1 nw1Var3 = (nw1) pair.first;
                nw1Var3.b();
                pathMeasure.getPosTan(length, nw1Var3.a, nw1Var3.b);
                nw1 nw1Var4 = (nw1) pair.second;
                nw1Var4.b();
                pathMeasure.getPosTan(length2, nw1Var4.a, nw1Var4.b);
                Matrix matrix = this.e;
                matrix.reset();
                matrix.setTranslate(f25, 0.0f);
                nw1Var3.e(f25);
                nw1Var4.e(f25);
                if (zB) {
                    float f31 = this.j * f3;
                    matrix.postScale(f5, f31);
                    nw1Var3.d(f31);
                    nw1Var4.d(f31);
                }
                path.transform(matrix);
                canvas2 = canvas;
                canvas2.drawPath(path, paint);
            } else {
                float[] fArr = ((nw1) pair.first).a;
                float f32 = fArr[0];
                float f33 = fArr[1];
                float[] fArr2 = ((nw1) pair.second).a;
                canvas.drawLine(f32, f33, fArr2[0], fArr2[1], paint);
                canvas2 = canvas;
                linearProgressIndicatorSpec = linearProgressIndicatorSpec2;
            }
            if (linearProgressIndicatorSpec.c()) {
                return;
            }
            if (f15 > 0.0f && fP0 > 0.0f) {
                j(canvas2, paint, (nw1) pair.first, f17, this.g, fP0, null, 0.0f, 0.0f, 0.0f, false);
            }
            if (f16 >= this.f || f21 <= 0.0f) {
                return;
            }
            j(canvas, paint, (nw1) pair.second, f18, this.g, f21, null, 0.0f, 0.0f, 0.0f, false);
        }
    }

    public final void j(Canvas canvas, Paint paint, nw1 nw1Var, float f, float f2, float f3, nw1 nw1Var2, float f4, float f5, float f6, boolean z) {
        float f7;
        float fMin = Math.min(f2, this.g);
        float f8 = (-f) / 2.0f;
        float f9 = (-fMin) / 2.0f;
        float f10 = f / 2.0f;
        float f11 = fMin / 2.0f;
        RectF rectF = new RectF(f8, f9, f10, f11);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (nw1Var2 != null) {
            float[] fArr = nw1Var2.b;
            float[] fArr2 = nw1Var2.a;
            float fMin2 = Math.min(f5, this.g);
            float fMin3 = Math.min(f4 / 2.0f, (f6 * fMin2) / this.g);
            RectF rectF2 = new RectF();
            if (z) {
                float f12 = (fArr2[0] - fMin3) - (nw1Var.a[0] - f3);
                if (f12 > 0.0f) {
                    nw1Var2.e((-f12) / 2.0f);
                    f7 = f4 + f12;
                } else {
                    f7 = f4;
                }
                rectF2.set(0.0f, f9, f10, f11);
            } else {
                float f13 = (fArr2[0] + fMin3) - (nw1Var.a[0] + f3);
                if (f13 < 0.0f) {
                    nw1Var2.e((-f13) / 2.0f);
                    f7 = f4 - f13;
                } else {
                    f7 = f4;
                }
                rectF2.set(f8, f9, 0.0f, f11);
            }
            RectF rectF3 = new RectF((-f7) / 2.0f, (-fMin2) / 2.0f, f7 / 2.0f, fMin2 / 2.0f);
            canvas.translate(fArr2[0], fArr2[1]);
            canvas.rotate(ow1.h(fArr));
            Path path = new Path();
            path.addRoundRect(rectF3, fMin3, fMin3, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.rotate(-ow1.h(fArr));
            canvas.translate(-fArr2[0], -fArr2[1]);
            float[] fArr3 = nw1Var.a;
            canvas.translate(fArr3[0], fArr3[1]);
            canvas.rotate(ow1.h(nw1Var.b));
            canvas.drawRect(rectF2, paint);
            canvas.drawRoundRect(rectF, f3, f3, paint);
        } else {
            float[] fArr4 = nw1Var.a;
            canvas.translate(fArr4[0], fArr4[1]);
            canvas.rotate(ow1.h(nw1Var.b));
            canvas.drawRoundRect(rectF, f3, f3, paint);
        }
        canvas.restore();
    }
}
